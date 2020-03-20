package cn.teamar.genki.pos.basic.po;

public class TRight {
    private Long id;

    private String rightName;

    private Byte rightType;

    private String rightCode;

    private String imageUrl;

    private String sourcePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public Byte getRightType() {
        return rightType;
    }

    public void setRightType(Byte rightType) {
        this.rightType = rightType;
    }

    public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }
}