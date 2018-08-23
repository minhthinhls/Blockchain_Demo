/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author thinh.huynh
 */
public class BlockChain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static ArrayList<Block> getBlockchain() {
        return blockchain;
    }

    public static void setBlockchain(ArrayList<Block> blockchain) {
        BlockChain.blockchain = blockchain;
    }
    
}
