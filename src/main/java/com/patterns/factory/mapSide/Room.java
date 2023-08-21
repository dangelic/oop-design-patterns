package com.patterns.factory.mapSide;

public class Room {
    private MapSide north, south, west, east;
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setSide(MapSide north, MapSide south, MapSide west, MapSide east) {
        this.north = north;
        this.south = south;
        this.west = west;
        this.east = east;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void enter() {
        System.out.println("You enter " + roomNo);
    }

    public MapSide getNorth() {
        return north;
    }

    public void setNorth(MapSide north) {
        this.north = north;
    }

    public MapSide getSouth() {
        return south;
    }

    public void getSouth(MapSide south) {
        this.south = south;
    }

    public MapSide getWest() {
        return west;
    }

    public void setWest(MapSide west) {
        this.west = west;
    }

    public MapSide getEast() {
        return east;
    }

    public void setEast(MapSide east) {
        this.east = east;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}