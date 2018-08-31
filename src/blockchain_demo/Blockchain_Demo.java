/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain_demo;

import com.google.gson.GsonBuilder;
import model.Block;
import model.BlockChain;

/**
 *
 * @author thinh.huynh
 */
public class Blockchain_Demo {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BlockChain blockchain = new BlockChain(5);
        // TODO code application logic here
        blockchain.generateGenesisBlock();

        blockchain.addBlock(new Block("Yo im the second block"));

        blockchain.addBlock(new Block("Hey im the third block"));

        System.out.println("\nBlockchain is Valid: " + blockchain.isChainValid());
        
        blockchain.getCurrentBlock().setData("HAHA");
        System.out.println("\nBlockchain after tampering, is still Valid ? " + blockchain.isChainValid());
        
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);
        
        /*
        Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Yo im the second block", genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hey im the third block", secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
         */
        // Add our blocks to the chain ArrayList:
        /*
        chain.add(new Block("Hi im the first block", "0"));
        chain.add(new Block("Yo im the second block", chain.get(chain.size() - 1).hash));
        chain.add(new Block("Hey im the third block", chain.get(chain.size() - 1).hash));

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(chain);
        System.out.println(blockchainJson);
         */
        
    }
    
}
