/**
 * Created by gitika on 1/5/18.
 */
public class WeightedQuickUnion {

        int a[];
        int size[];
        int count;

    WeightedQuickUnion(int N) {
            a = new int[N];
            size = new int[N];
            for (int i = 0; i < N ; i++) {
                a[i] = i;
                size[i] = 1;
            }
        }

        public int root(int p) {
            while (a[p] != p) {
                p = a[p];
            }
            return p;
        }

        public void union(int p, int q) {

            int pid = root(p);
            int qid = root(q);
            if (pid == qid) {
            return;
            }
            if (size[pid] < size[qid] ) {
                a[pid] = qid;
                size[qid] += size[pid];
            } else {
                a[qid] = pid;
                size[pid] += size[qid];
            }

        }
        public boolean connected(int p, int q) {
            return root(p) == root(q);
        }

        public  static void main(String args[]) {
            WeightedQuickUnion uf = new WeightedQuickUnion(10);
            uf.union(4,3);
            uf.union(3,8);
            uf.union(6,5);
            uf.union(9,4);
            uf.union(2,1);
            System.out.println(uf.connected(0,7));
            System.out.println(uf.connected(8,9));
            uf.union(5,0);
            uf.union(7,2);
            uf.union(6,1);
            System.out.println(uf.connected(0,7));

            System.out.println(uf.connected(1,0));
            System.out.println(uf.connected(6,7));

        }
    }


