public class Trie {
    static class TrieNode{
        TrieNode children[];
        boolean eow;
        TrieNode(){
            children = new TrieNode[26];
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static TrieNode root = new TrieNode();
    public static void insert(String word){
        TrieNode curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word){
        TrieNode curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }
    public static void main(String args[]){
        String words[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println("All words inserted");
        System.out.println("Search for 'the': " + search("the"));
        
        
        








    }
    
}
