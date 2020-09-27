import java.util.*;
import java.util.stream.Collectors;

public class ArcheryTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> shootingField = Arrays.stream(scan.nextLine().split("\\|")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();
        int point = 0;

        while (!input.equals("Game over")) {
            String[] commands = input.split("@");
            String instruction = commands[0];

            switch (instruction) {
                case "Shoot Left":
                    int startIndex = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);

                    if(startIndex < shootingField.size() && startIndex >= 0) {
                      int indexToShoot = 0;
                        indexToShoot = startIndex;
                        for (int i = 0; i <= length; i++) {

                            if (indexToShoot < shootingField.size()) {
                                indexToShoot += 1;
                            } else {
                                indexToShoot--;
                            }
                        }

                        if (shootingField.get(indexToShoot) >= 5) {
                            shootingField.set(indexToShoot, shootingField.get(indexToShoot) - 5);
                            point += 5;
                        } else {
                            point += shootingField.get(indexToShoot);
                            shootingField.set(indexToShoot, 0);

                        }


                    }


                    break;
                case "Shoot Right":
                    int startIndexRight = Integer.parseInt(commands[1]);
                    int lengthRight = Integer.parseInt(commands[2]);

                    if (startIndexRight < shootingField.size() && startIndexRight >= 0) {
                        int indexToShootRight = 0;
                        indexToShootRight = startIndexRight;
                        for (int i = 0; i < lengthRight; i++) {


                            if (indexToShootRight > 0) {
                                indexToShootRight--;
                            } else {
                                indexToShootRight = shootingField.size() - 1;
                            }
                        }

                        if (shootingField.get(indexToShootRight) >= 5) {
                            shootingField.set(indexToShootRight, shootingField.get(indexToShootRight) - 5);
                            point += 5;
                        } else {
                            point += shootingField.get(indexToShootRight);
                            shootingField.set(indexToShootRight, 0);



                        }
                    }
                    break;
                case "Reverse":
                    Collections.reverse(shootingField);
                    break;

            }

            input = scan.nextLine();
        }
        for (int i = 0; i < shootingField.size() ; i++) {
            if (i + 1 == shootingField.size()) {
                System.out.printf("%d%n", shootingField.get(i));
            } else {
                System.out.print(shootingField.get(i) + " - ");
            }

        }
        System.out.printf("Iskren finished the archery tournament with %d!%n", point);


        }
    }

