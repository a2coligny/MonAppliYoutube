package models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by auriane on 22/03/2017.
 */

public class Cell_result {


    /**
     * kind : youtube#searchListResponse
     * etag : "uQc-MPTsstrHkQcRXL3IWLmeNsM/WDaq7qrfMpcaf0sictKzRbv5NrY"
     * nextPageToken : CAUQAA
     * regionCode : FR
     * pageInfo : {"totalResults":1000000,"resultsPerPage":5}
     * items : [{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/7bftcRjmylrfQw4ZYU4UANalk3Y\"","id":{"kind":"youtube#video","videoId":"-ztOv3unxkI"},"snippet":{"publishedAt":"2015-06-14T13:19:14.000Z","channelId":"UC0jjmu3_QzXyMkwYRGUc8Eg","title":"✄-- How to n°9 ┆10 conseils pour débuter en couture !","description":"(HD) Hey ! J'espère que vous pétez la forme ! Nouvelle vidéo conseil qui j'espère vous sera utile ! ^^ N'hésitez pas à donner vos propres conseils en ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/hqdefault.jpg","width":480,"height":360}},"channelTitle":"La Fabrik de Fanny","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/1WfCFNn1x858Wy1zxxmF5rOLVlc\"","id":{"kind":"youtube#video","videoId":"yM6IguQA_8w"},"snippet":{"publishedAt":"2015-09-09T08:56:10.000Z","channelId":"UCBkX1sWQPvEIUtqGCNa1CuQ","title":"Nouveau : cours de couture & patrons en ligne pour débutants","description":"Apprenez à coudre étapes par étapes avec Filoute. Le principe : un abonnement mensuel qui comprend une vidéo de 30 minutes par semaine et des patrons ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/yM6IguQA_8w/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/yM6IguQA_8w/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/yM6IguQA_8w/hqdefault.jpg","width":480,"height":360}},"channelTitle":"Filoute","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/-NlgDmZJgsyMCg0e-4TDoOCxdwA\"","id":{"kind":"youtube#video","videoId":"ObJd0OLH7GY"},"snippet":{"publishedAt":"2016-02-22T02:58:35.000Z","channelId":"UCk-nxzyAUCJoeWyPXaDsbFw","title":"COUTURE vs TORI DOE QOTR presented by BABS BUNNY & VAGUE (FULL BATTLE)","description":"Queen of the Ring is back and FINALLY we have Couture vs Tori Doe. This back and forth will have the fans debating for a very long time on who won. As you ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/ObJd0OLH7GY/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/ObJd0OLH7GY/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/ObJd0OLH7GY/hqdefault.jpg","width":480,"height":360}},"channelTitle":"queenofthering","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/-xmrx9V1aT4kGDb_YsbDQNKLQdc\"","id":{"kind":"youtube#video","videoId":"Nih7dXQ5hy8"},"snippet":{"publishedAt":"2013-03-02T20:50:59.000Z","channelId":"UCk-nxzyAUCJoeWyPXaDsbFw","title":"BABS BUNNY & VAGUE presents QUEEN OF THE RING COUTURE vs JAI SMOOVE","description":"The return of the fan favorite Couture vs the debut of Sparring Session fan favorite of Jai Smoove. Can Jai take this bout by out barring Couture or can Couture ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/Nih7dXQ5hy8/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/Nih7dXQ5hy8/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/Nih7dXQ5hy8/hqdefault.jpg","width":480,"height":360}},"channelTitle":"queenofthering","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/XPsaUgNAw7XoyNXY91JlYVjvpqk\"","id":{"kind":"youtube#video","videoId":"6UMwftLlrQQ"},"snippet":{"publishedAt":"2017-01-30T02:54:53.000Z","channelId":"UCclHSnngVTZK7LEOQAzcg1w","title":"Making-of the Spring-Summer 2017 Haute Couture CHANEL Collection","description":"Film on the making-of the Spring-Summer 2017 Haute Couture collection. View the full CHANEL Spring-Summer 2017 fashion show at ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/6UMwftLlrQQ/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/6UMwftLlrQQ/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/6UMwftLlrQQ/hqdefault.jpg","width":480,"height":360}},"channelTitle":"CHANEL","liveBroadcastContent":"none"}}]
     */

    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;
    private PageInfoBean pageInfo;
    private List<ItemsBean> items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfoBean getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoBean pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class PageInfoBean {
        /**
         * totalResults : 1000000
         * resultsPerPage : 5
         */

        private int totalResults;
        private int resultsPerPage;

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }
    }

    public static class ItemsBean {
        /**
         * kind : youtube#searchResult
         * etag : "uQc-MPTsstrHkQcRXL3IWLmeNsM/7bftcRjmylrfQw4ZYU4UANalk3Y"
         * id : {"kind":"youtube#video","videoId":"-ztOv3unxkI"}
         * snippet : {"publishedAt":"2015-06-14T13:19:14.000Z","channelId":"UC0jjmu3_QzXyMkwYRGUc8Eg","title":"✄-- How to n°9 ┆10 conseils pour débuter en couture !","description":"(HD) Hey ! J'espère que vous pétez la forme ! Nouvelle vidéo conseil qui j'espère vous sera utile ! ^^ N'hésitez pas à donner vos propres conseils en ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/hqdefault.jpg","width":480,"height":360}},"channelTitle":"La Fabrik de Fanny","liveBroadcastContent":"none"}
         */

        private String kind;
        private String etag;
        private IdBean id;
        private SnippetBean snippet;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getEtag() {
            return etag;
        }

        public void setEtag(String etag) {
            this.etag = etag;
        }

        public IdBean getId() {
            return id;
        }

        public void setId(IdBean id) {
            this.id = id;
        }

        public SnippetBean getSnippet() {
            return snippet;
        }

        public void setSnippet(SnippetBean snippet) {
            this.snippet = snippet;
        }

        public static class IdBean {
            /**
             * kind : youtube#video
             * videoId : -ztOv3unxkI
             */

            private String kind;
            private String videoId;

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getVideoId() {
                return videoId;
            }

            public void setVideoId(String videoId) {
                this.videoId = videoId;
            }
        }

        public static class SnippetBean {
            /**
             * publishedAt : 2015-06-14T13:19:14.000Z
             * channelId : UC0jjmu3_QzXyMkwYRGUc8Eg
             * title : ✄-- How to n°9 ┆10 conseils pour débuter en couture !
             * description : (HD) Hey ! J'espère que vous pétez la forme ! Nouvelle vidéo conseil qui j'espère vous sera utile ! ^^ N'hésitez pas à donner vos propres conseils en ...
             * thumbnails : {"default":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/-ztOv3unxkI/hqdefault.jpg","width":480,"height":360}}
             * channelTitle : La Fabrik de Fanny
             * liveBroadcastContent : none
             */

            private String publishedAt;
            private String channelId;
            private String title;
            private String description;
            private ThumbnailsBean thumbnails;
            private String channelTitle;
            private String liveBroadcastContent;

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getChannelId() {
                return channelId;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public ThumbnailsBean getThumbnails() {
                return thumbnails;
            }

            public void setThumbnails(ThumbnailsBean thumbnails) {
                this.thumbnails = thumbnails;
            }

            public String getChannelTitle() {
                return channelTitle;
            }

            public void setChannelTitle(String channelTitle) {
                this.channelTitle = channelTitle;
            }

            public String getLiveBroadcastContent() {
                return liveBroadcastContent;
            }

            public void setLiveBroadcastContent(String liveBroadcastContent) {
                this.liveBroadcastContent = liveBroadcastContent;
            }

            public static class ThumbnailsBean {
                /**
                 * default : {"url":"https://i.ytimg.com/vi/-ztOv3unxkI/default.jpg","width":120,"height":90}
                 * medium : {"url":"https://i.ytimg.com/vi/-ztOv3unxkI/mqdefault.jpg","width":320,"height":180}
                 * high : {"url":"https://i.ytimg.com/vi/-ztOv3unxkI/hqdefault.jpg","width":480,"height":360}
                 */

                @SerializedName("default")
                private DefaultBean defaultX;
                private MediumBean medium;
                private HighBean high;

                public DefaultBean getDefaultX() {
                    return defaultX;
                }

                public void setDefaultX(DefaultBean defaultX) {
                    this.defaultX = defaultX;
                }

                public MediumBean getMedium() {
                    return medium;
                }

                public void setMedium(MediumBean medium) {
                    this.medium = medium;
                }

                public HighBean getHigh() {
                    return high;
                }

                public void setHigh(HighBean high) {
                    this.high = high;
                }

                public static class DefaultBean {
                    /**
                     * url : https://i.ytimg.com/vi/-ztOv3unxkI/default.jpg
                     * width : 120
                     * height : 90
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class MediumBean {
                    /**
                     * url : https://i.ytimg.com/vi/-ztOv3unxkI/mqdefault.jpg
                     * width : 320
                     * height : 180
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class HighBean {
                    /**
                     * url : https://i.ytimg.com/vi/-ztOv3unxkI/hqdefault.jpg
                     * width : 480
                     * height : 360
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }
            }
        }
    }
}
