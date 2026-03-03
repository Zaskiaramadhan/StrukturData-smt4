class Island {
    String name;
    Island next;

    public Island(String name) {
        this.name = name;
        this.next = null;
    }
}

class GrandLine {
    Island head;

    public void addIsland(String name) {
        Island newIsland = new Island(name);

        if (head == null) {
            head = newIsland;
        } else {
            Island current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newIsland;
        }
    }

    public void busterCall(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Island current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printLogbook() {
        Island current = head;
        System.out.print("Grand Line Route: ");

        while (current != null) {
            if (current.next == null) {
                System.out.print(current.name + " (End)");
            } else {
                System.out.print(current.name + " -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public boolean isIslandOnRoute(String name) {
        Island current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int countIslands() {
        int count = 0;
        Island current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}

public class Mission2OnePiece {
    public static void main(String[] args) {

        GrandLine route = new GrandLine();

        route.addIsland("Alabasta");
        route.addIsland("Skypiea");
        route.addIsland("Water 7");
        route.addIsland("Enies Lobby");
        route.printLogbook();

        System.out.println("Visited Fishman Island? " +
                route.isIslandOnRoute("Fishman Island"));

        System.out.println("Buster Call initiated on Enies Lobby!");
        route.busterCall("Enies Lobby");
        route.printLogbook();
        
        System.out.println("Total Islands visited: " +
                route.countIslands());
    }
}