package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.OakTree;
import com.xworkz.inheritence.internal.Tree;

public class AppleTree {

    public void plant(Tree tree){
        tree.shedLeaves();
        tree.provideOxygen();
        tree.grow();
        tree.photosynthesize();
        tree.bearFruit();
        if(tree instanceof OakTree){
            OakTree oakTree = (OakTree) tree;
            oakTree.pourWater();        }
    }
}
