package edu.apcs.project;

//This class will generate the Catalog of Fishes

import edu.apcs.project.models.AngelFish;
import edu.apcs.project.models.FightingFish;
import edu.apcs.project.models.Fish;
import edu.apcs.project.models.GoldFish;
import edu.apcs.project.models.Tetra;

public class Catalog {

  public static Fish getFish(Fish[][] catalog, String name) {
    for (int i = 0; i < catalog.length; i++) {
      for (int j = 0; j < catalog[i].length; j++) {
        Fish fish = catalog[i][j];
        if (fish.getName().equalsIgnoreCase(name)) {
          return fish;
        }
      }
    }
    return null;
  }

  public static boolean isCorrectName(Fish fish) {
    if (fish != null && fish.getName() != null) {
      return true;
    }
    return false;
  }

  public static boolean isNoOfItemAvailable(Fish fish, int count) {
    if (fish.getNoOfItems() >= count) {
      return true;
    }
    return false;
  }

  public static Fish[][] generateCatalog() {
    Fish[][] catalog = new Fish[4][4];


    Fish fish01 = new GoldFish("Fantail", 6f, " Mixed", 6f, "poses an egg-shaped body and a high dorsal fin", 10);
    Fish fish02 = new GoldFish("Ranchu", 7f, " Orange", 10f, "king of goldfish, eggfish", 10);
    Fish fish03 = new GoldFish("Telescope", 9f, " Black&White", 15, "known for its panda color scheme", 10);
    Fish fish04 = new GoldFish("Comet", 8f, " Bronze", 9f, "Smaller and slimmer than the normal goldfish", 10);

    Fish fish10 = new AngelFish("Altum", 7f, "silver", 10f, "Brazilian fish, referred to as deep angelfish", 10);
    Fish fish11 = new AngelFish("Gold", 6f, "gold", 7f, "known to be one of the most beautiful fish", 10);
    Fish fish12 = new AngelFish("BlackLace", 8f, "black", 11f, "most peaceful from the other Angel fish", 10);
    Fish fish13 = new AngelFish("Leopard", 9f, "black&yellow", 13f, "known for their leopard like colors", 10);

    Fish fish20 = new Tetra("Phantom", 1.4f, "purple", 5f, "From Brazil and Bolivia", 10);
    Fish fish21 = new Tetra("XRay", 1.8f, "transparent", 6f, "known for its transparent body", 10);
    Fish fish22 = new Tetra("BloodFin", 1.7f, "red", 5f, "know for its red fins", 10);
    Fish fish23 = new Tetra("Cardinal", 2.1f, "red", 6f, "found in fresh water", 10);

    Fish fish30 = new FightingFish("Crown Tail", 2.7f, "red", 19f, "Known for its spiky tail", 10);
    Fish fish31 = new FightingFish("Double Tail", 2.9f, "white", 15f, "known for its two distinct tails", 10);
    Fish fish32 = new FightingFish("Feathertail", 2.5f, "blue", 17f, "known for its attribute of overlapping fins", 10);
    Fish fish33 = new FightingFish("Plakat", 3.1f, "yellow", 12f, "they have short tails and are less prone to injury", 10);

    catalog[0][0] = fish01;
    catalog[0][1] = fish02;
    catalog[0][2] = fish03;
    catalog[0][3] = fish04;

    catalog[1][0] = fish10;
    catalog[1][1] = fish11;
    catalog[1][2] = fish12;
    catalog[1][3] = fish13;


    catalog[2][0] = fish20;
    catalog[2][1] = fish21;
    catalog[2][2] = fish22;
    catalog[2][3] = fish23;

    catalog[3][0] = fish30;
    catalog[3][1] = fish31;
    catalog[3][2] = fish32;
    catalog[3][3] = fish33;

    return catalog;
  }


}
