package ua.lviv.iot;

public class Node {
    int data;
    Node parent;
    Node left;
    Node right;
    int color; // if node is black: color = 0; elif node is red: color = 1
}
