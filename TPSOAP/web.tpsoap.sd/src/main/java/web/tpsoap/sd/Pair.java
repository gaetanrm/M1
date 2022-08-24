package web.tpsoap.sd;

public class Pair<L, R> {
    private L left;
    private R right;

    public Pair(L left, R right){
        this.setLeft(left);
        this.setRight(right);
    }

	public R getRight() {
		return right;
	}

	public void setRight(R right) {
		this.right = right;
	}

	public L getLeft() {
		return left;
	}

	public void setLeft(L left) {
		this.left = left;
	}

}
