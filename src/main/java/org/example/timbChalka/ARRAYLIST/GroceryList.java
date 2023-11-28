package org.example.timbChalka.ARRAYLIST;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //using CRUD
    //C - Create or Add items to a list
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    //R - Read items in a list
    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size()+ " items in your grocery List");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1)+", "+groceryList.get(i));
        }
    }

    //U - Update items in a list
    private void modifyGroceryItem(String newItem){
        int position = findItem(newItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // D - Delete an item from a list
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public int findItem(String searchItem){

       return groceryList.indexOf(searchItem);
        //OR
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0){
//            return groceryList.get(position);
//        }
//        return null;
    }
}














