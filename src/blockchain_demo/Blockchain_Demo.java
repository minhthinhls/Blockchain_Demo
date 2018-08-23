/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain_demo;

import com.google.gson.GsonBuilder;
import model.Block;
import static model.BlockChain.blockchain;

/**
 *
 * @author thinh.huynh
 */
public class Blockchain_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Yo im the second block", genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hey im the third block", secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
         */
        // Add our blocks to the blockchain ArrayList:
        blockchain.add(new Block("Hi im the first block", "0"));
        blockchain.add(new Block("Yo im the second block", blockchain.get(blockchain.size() - 1).hash));
        blockchain.add(new Block("Hey im the third block", blockchain.get(blockchain.size() - 1).hash));

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);
    }

}
