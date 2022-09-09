package Algorithms;

import Algorithms.Graph.NewFriends;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        var obj=new NewFriends();
        int n=sc.nextInt();
        Set<String> mutualFriends=new HashSet<>();
        Set<String > friends=new HashSet<>();
        for(int i=0;i<n;i++){
//            System.out.println("Enter the name");
            String mutualFriend= sc.next();
            mutualFriends.add(mutualFriend);
            obj.addNode(mutualFriend);
            int numbers=sc.nextInt();
            for(int j=0;j<numbers;j++){
                String friend=sc.next();
                if(!mutualFriends.contains(friend)){
                    friends.add(friend);
                }
                obj.addEdge(mutualFriend,friend);
            }
            if(friends.contains(mutualFriend))
                friends.remove(mutualFriend);


        }
        obj.print();
       var result=obj.findFriends(mutualFriends,friends);
        System.out.println(result);
    }


}
