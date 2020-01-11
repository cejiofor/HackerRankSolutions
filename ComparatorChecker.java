class ComparatorChecker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score > b.score){
            return -1;
        }
        else if (a.score < b.score){
            return 1;
        }
        else if (a.score == b.score){
            char aFirstLetter = a.name.charAt(0);
            char bFirstLetter = b.name.charAt(0);
            if (aFirstLetter > bFirstLetter){
                return 1;
            }
            else if (aFirstLetter < bFirstLetter){
                return -1;
            }
            else{
                return 0;
            } 
        }
    }
}
