<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <script src="https://cdn.tiny.cloud/1/s0sdrgn4gfs4jcz723j3wp5ww5p2d3qijj00r3ejftd1fd9v/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
</head>
<body>
<form action="/user/savepost" method="post">
 Enter Title::<h2><input type="text" name="post_title"/></h2>
  <textarea name="post_content">
    Welcome to TinyMCE!
  </textarea>
  <input type="submit" value="post"/>
  </form>
  <script>
    tinymce.init({
      selector: 'textarea',
      plugins: 'a11ychecker advcode casechange formatpainter linkchecker autolink lists checklist media mediaembed pageembed permanentpen powerpaste table advtable tinycomments tinymcespellchecker',
      toolbar: 'a11ycheck addcomment showcomments casechange checklist code formatpainter pageembed permanentpen table',
      toolbar_mode: 'floating',
      tinycomments_mode: 'embedded',
      tinycomments_author: 'Author name'
    });
  </script>
  
</body>
</html>