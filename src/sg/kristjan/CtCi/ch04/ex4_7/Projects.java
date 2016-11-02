package sg.kristjan.CtCi.ch04.ex4_7;


import java.util.ArrayList;
import java.util.Hashtable;

public class Projects {
    private class Project {
        public ArrayList<Project> dependants = new ArrayList<>();
        private String name;

        public Project(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    private Hashtable<String, Project> projects = new Hashtable<>();
    private ArrayList<Project> projectsWithNoDependencies = new ArrayList<>();

    public Projects(String[] projectNames, ArrayList<String[]> dependencies) {
        for (String name : projectNames) {
            Project project = new Project(name);
            projects.put(name, project);
            projectsWithNoDependencies.add(project);
        }

        for (String[] pair : dependencies) {
            String projectName = pair[0];
            Project project = projects.get(projectName);
            String dependantName = pair[1];
            Project dependant = projects.get(dependantName);
            project.dependants.add(dependant);
            projectsWithNoDependencies.remove(dependant);
        }
    }

    public String toString() {
        StringBuilder projectSb = new StringBuilder();
        for (Project project : projects.values()) {
            projectSb.append(project.toString());
            projectSb.append(": [");
            StringBuilder depSb = new StringBuilder();
            for (Project dep : project.dependants) {
                depSb.append(dep.toString());
                depSb.append(", ");
            }
            depSb.append("]; ");
            projectSb.append(depSb.toString());
        }
        return projectSb.toString();
    }

    public ArrayList<String> buildOrder() {
        ArrayList<String> order = new ArrayList<>();
        for (Project project : projectsWithNoDependencies) {
            addToOrder(order, project);
        }
        return order;
    }

    private void addToOrder(ArrayList<String> order, Project project) {
        if (order.size() == this.projects.size()) return;
        if (!order.contains(project.toString())) order.add(project.toString());
        for (Project dependant : project.dependants) {
            if (order.contains(dependant.toString())) continue;
            order.add(dependant.toString());
            addToOrder(order, dependant);
        }
    }
}