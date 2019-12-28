const THUMBNAIL_URL_ROOT = "https://i3.ytimg.com/vi/";
const THUMNAIL_SUFFIX = "/mqdefault.jpg";
const YT_PLAYLIST_ITEMS_URL = 'https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&maxResults=20&key=AIzaSyCFLSpoSKQF2IytfFyLtMzS94OcshVNj94';
const YT_PLAYLISTS_URL = 'https://www.googleapis.com/youtube/v3/playlists?part=snippet&key=AIzaSyCFLSpoSKQF2IytfFyLtMzS94OcshVNj94&maxResults=20';

class Constant {
  static getYTPlayListItemsLink(String playlistId, String nextPageToken){
    String url = YT_PLAYLIST_ITEMS_URL + '&playlistId=' + playlistId;
    if(nextPageToken != null){
      url = url + '&pageToken=' + nextPageToken;
    }
    
    return url;
  }

  static getYTPlayListsLink(String channelId, String nextPageToken){
    String url = YT_PLAYLISTS_URL + '&channelId=' + channelId;
    if(nextPageToken != null){
      url = url + '&pageToken=' + nextPageToken;
    }
    
    return url;
  }

  static getYTThumbnailByVideoId(String videoId){
    return THUMBNAIL_URL_ROOT + videoId + THUMNAIL_SUFFIX;
  }

}