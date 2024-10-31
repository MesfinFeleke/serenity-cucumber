package com.mdf.stepLib;

import com.mdf.pages.SearchFromList;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SearchAnItem {

    public static Performable withName(String itemName){
        return Task.where("{0} adds an item with name "+itemName,
                Enter.theValue(itemName)
                        .into(SearchFromList.ITEM_NAME_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
