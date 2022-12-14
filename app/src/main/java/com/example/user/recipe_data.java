package com.example.user;

public class recipe_data {

    String[] ingredient;
    String[] recipe;
    int maxPage;
    int maxItem;

    public recipe_data(String[] ingredient, String[] recipe, int maxPage, int maxItem){
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.maxPage = maxPage;
        this.maxItem = maxItem;
    }

    public String getRecipeData (int page){
        String result = new String();

        result = recipe[page];

        return result;
    }

    public String getIngredient (int page){
        String result = new String();

        result = ingredient[page];

        return result;
    }

    public int getMaxPage (){
        return maxPage;
    }

    public int getMaxItem(){
        return maxItem;
    }

    public void setRecipe(String[] recipe) {
        this.recipe = recipe;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }

    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }
}
