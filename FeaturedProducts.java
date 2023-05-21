import java.util.*;

public class FeaturedProducts {

    public static void main(String[] args) {
        List<String> products = Arrays.asList("redShirt", "greenPants", "redShirt", "orangeShoes", "blackPants", "blackPants");
        Collections.sort(products);
        int counter = 1;
        String product = products.get(0);
        int tmpCounter = 1;
        String tempProduct = products.get(0);
        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).equals(tempProduct)) {
                tmpCounter++;
            } else {
                if (counter <= tmpCounter){
                    counter = tmpCounter;
                    product = tempProduct;
                }
                tmpCounter = 1;
                tempProduct = products.get(i);
            }
        }
        if (counter <= tmpCounter){
            product = tempProduct;
        }
        System.out.println(product);
    }
}







