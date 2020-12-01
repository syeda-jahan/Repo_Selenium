package Class4;

import org.testng.annotations.Test;

public class AdvancedXpath {
    @Test
    public void xpath(){

        /**
         * if use parent or grand-parent : use double //, example:
         *
         * Xpath Axes: Advanced indirect xPath
         * for sibling, use single /
         *
         *
         *  1. following-sibling :
         *  //label[text()='Female']/following-sibling::input
         *  //tag1[(conditions)]/following-sibling::tag2[(conditions)]
         *
         * 2. Preceding -sibling :
         * //tag1[(conditions)]/Preceding-sibling::tag2[(conditions)]
         *
         * 3. following tag but not sibling :
         * //tag1[(conditions)]/following::tag2[(conditions)]
         *
         *
         * 4. preceding tag but not sibling :
         * //tag1[(conditions)]/preceding::tag2[(conditions)]
         *
         * Always take xpath=1 ,if result are more than 1
         *
         *
         * 5. descendant : //tag1[(conditions)]/descendant::tag2[(conditions)]
         *
         * 6. ancestor : //tag1[(conditions)]/ancestor::tag2[(conditions)]
         */
    }


}
