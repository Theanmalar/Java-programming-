Import java.util.HashMap;
Import java.util.Map;
Import java.util.Scanner;

Public class VotingSystem {
    Private HashMap<String, Integer> candidates; // Candidate name and their vote count

    Public VotingSystem() {
        Candidates = new HashMap<>();
    }

    // Method to add a candidate
    Public void addCandidate(String candidateName) {
        If (!candidates.containsKey(candidateName)) {
            Candidates.put(candidateName, 0); // Initialize votes to 0
            System.out.println(candidateName + “ has been added as a candidate.”);
        } else {
            System.out.println(candidateName + “ is already a candidate.”);
        }
    }

    // Method to cast a vote
    Public void vote(String candidateName) {
        If (candidates.containsKey(candidateName)) {
            Candidates.put(candidateName, candidates.get(candidateName) + 1); // Increment vote count
            System.out.println(“Vote casted for “ + candidateName + “.”);
        } else {
            System.out.println(“Candidate “ + candidateName + “ does not exist.”);
        }
    }

    // Method to display the vote tally
    Public void displayVotes() {
        System.out.println(“\nCurrent Vote Tally:”);
        For (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + “: “ + entry.getValue() + “ votes”);
        }
    }

    // Method to declare the winner
    Public void declareWinner() {
        String winner = null;
        Int maxVotes = -1;
        For (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            If (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        If (winner != null) {
            System.out.println(“\nThe winner is: “ + winner + “ with “ + maxVotes + “ votes.”);
        } else {
            System.out.println(“No votes have been cast.”);
        }
    }

    Public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);
        String command;

        // Adding candidates
        votingSystem.addCandidate(“Aarav”);
        votingSystem.addCandidate(“Dhee”);
        votingSystem.addCandidate(“Vasi”);

        System.out.println(“Voting System”);
        System.out.println(“Available commands: vote, tally, winner, exit”);

        While (true) {
            System.out.print(“\nEnter command: “);
            Command = scanner.nextLine().trim().toLowerCase();

            Switch (command) {
                Case “vote”:
                    System.out.print(“Enter candidate name to vote for: “);
                    String candidateName = scanner.nextLine();
                    votingSystem.vote(candidateName);
                    break;

                case “tally”:
                    votingSystem.displayVotes();
                    break;

                case “winner”:
                    votingSystem.declareWinner();
                    break;

                case “exit”:
                    System.out.println(“Exiting the voting system.”);
                    Scanner.close();
                    Return;

                Default:
                    System.out.println(“Invalid command. Please try again.”);
            }
        }
    }
}
