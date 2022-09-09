package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FamilyRelation {


    private class Node{

        private String name;


        public Node(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    Map<String ,Node> nodes=new HashMap<>();

    Map<Node, LinkedList<Node>> adjacentList=new HashMap<>();

    public void addNode(String name){
        Node node=new Node(name);
        nodes.putIfAbsent(name,node);
        adjacentList.putIfAbsent(node,new LinkedList<>());
    }

    public void addEdge(String from,String to){
        addNode(from);
        addNode(to);
        var fromNode=nodes.get(from);
        var toNode=nodes.get(to);
        adjacentList.get(fromNode).add(toNode);
    }

    public int findGrandChild(String input) {
        int count=0;
        for(var child:adjacentList.get(nodes.get(input))){
//            System.out.println(child);
            for(var grandChild:adjacentList.get(child)){
                count++;
                System.out.println(grandChild);
            }
        }
        return count;
    }
    public void print(){
        for(var source:adjacentList.keySet()){
            var destination=adjacentList.get(source);
            if(!destination.isEmpty())
                System.out.println(source+" is connected to "+destination);
        }
    }

    public boolean hasParent(String name){
        return nodes.containsKey(name);
    }

}
