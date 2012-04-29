package rajawali;

import java.io.Serializable;

public class SerializedObject3D implements Serializable {
	private static final long serialVersionUID = 5264861128471177349L;

	protected float[] mVertices;
	protected float[] mNormals;
	protected float[] mTextureCoords;
	protected float[] mColors;
	protected int[] mIndices;
	protected float[][] mFrameNormals;
	protected float[][] mFrameVertices;
	
	public SerializedObject3D(int numVertices, int numNormals, int numTextureCoords, int numColors, int numIndices) {
		mVertices = new float[numVertices];
		mNormals = new float[numNormals];
		mTextureCoords = new float[numTextureCoords];
		mColors = new float[numColors];
		mIndices = new int[numIndices];
	}
	
	public float[] getVertices() {
		return mVertices;
	}
	public void setVertices(float[] vertices) {
		this.mVertices = vertices;
	}
	public float[] getNormals() {
		return mNormals;
	}
	public void setNormals(float[] normals) {
		this.mNormals = normals;
	}
	public float[] getTextureCoords() {
		return mTextureCoords;
	}
	public void setTextureCoords(float[] textureCoords) {
		this.mTextureCoords = textureCoords;
	}
	public int[] getIndices() {
		return mIndices;
	}
	public void setIndices(int[] indices) {
		this.mIndices = indices;
	}

	public float[] getColors() {
		return mColors;
	}

	public void setColors(float[] colors) {
		this.mColors = colors;
	}
	
	public void setFrameVertices(float[][] frameVertices) {
		this.mFrameVertices = frameVertices;
	}
	
	public float[][] getFrameVertices() {
		return mFrameVertices;
	}
	
	public void setFrameNormals(float[][] frameNormals) {
		this.mFrameNormals = frameNormals;
	}
	
	public float[][] getFrameNormals() {
		return mFrameNormals;
	}
}
