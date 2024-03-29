package com.skillstorm;

public class BigCat extends Cat {
    boolean heavy = true;

    public BigCat() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (heavy ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        BigCat other = (BigCat) obj;
        if (heavy != other.heavy)
            return false;
        return true;
    }

    public BigCat(String name, int weight){
        super(name, weight);
    }

}
