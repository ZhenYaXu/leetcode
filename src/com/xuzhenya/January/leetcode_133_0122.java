package com.xuzhenya.January;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.01.22
 */
public class leetcode_133_0122 {
    public Node cloneGraph(Node node) {
        if (node == null)   return null;
        Map<Node, Node> res = new HashMap<>();
        return dfs(node, res);
    }

    private Node dfs(Node node, Map<Node,Node> res) {
        if (res.containsKey(node))  return res.get(node);
        Node cloneNode = new Node(node.val, new ArrayList<>());
        res.put(node,cloneNode);
        for (Node neighbor : cloneNode.neighbors) {
            cloneNode.neighbors.add(dfs(neighbor,res));
        }
        return cloneNode;
    }

//    public Node cloneGraph(Node node) {
//        Map<Node, Node> lookup = new HashMap<>();
//        return dfs(node, lookup);
//    }
//
//    private Node dfs(Node node, Map<Node,Node> lookup) {
//        if (node == null) return null;
//        if (lookup.containsKey(node)) return lookup.get(node);
//        Node clone = new Node(node.val, new ArrayList<>());
//        lookup.put(node, clone);
//        for (Node n : node.neighbors)clone.neighbors.add(dfs(n,lookup));
//        return clone;
//    }
}


