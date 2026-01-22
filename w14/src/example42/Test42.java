package example42;

import java.util.*;
import java.util.function.Predicate;

public class Test42 {


    public static void main(String[] args) {
        HashSet<Task> tasks = new HashSet<>();
        tasks.add(new Task("Napisać raport", true));
        tasks.add(new Task("Wysłać maile", false));
        tasks.add(new Task("Przygotować prezentację", true));
        tasks.add(new Task("Zadzwonić do klienta", false));
        tasks.add(new Task("Zaktualizować dokumentację", true));

        System.out.println("Przed usunięciem: " + tasks.size() + " zadań");

        Predicate<Task> isCompleted = Task::isCompleted;
        int removed = removeIf(tasks, isCompleted);

        System.out.println("Usunięto " + removed + " ukończonych zadań");
        System.out.println("Po usunięciu: " + tasks.size() + " zadań");
        System.out.println("Pozostałe zadania: " + tasks);
    }

    public static <E> int removeIf(HashSet<E> set, Predicate<E> condition) {
        ArrayList<E> toRemove = new ArrayList<>();
        for (E item : set) {
            if (condition.test(item)) {
                toRemove.add(item);
            }
        }
        for (E item : toRemove) {
            set.remove(item);
        }
        return toRemove.size();
    }
}

class Task {
    private String description;
    private boolean completed;

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Task{description='" + description + "', completed=" + completed + "}";
    }
}