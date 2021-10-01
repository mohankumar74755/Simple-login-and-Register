<%@include file="CommonHeader.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
div {
  background-color: green;
}

div.first {
  opacity: 0.1;
}

div.second {
  opacity: 0.3;
}

div.third {
  opacity: 0.6;
}
</style>
<div class="col-md-5">
	<form role="form" method="post" action="SignIn">
		<fieldset>
			<p class="text-uppercase">Login using your account:</p>

			<div class="form-group">
				<input type="email" name="username" id="username"
					class="form-control input-lg" placeholder="username">
			</div>
			<div class="form-group">
				<input type="password" name="password" id="password"
					class="form-control input-lg" placeholder="Password">
			</div>
			<div>
				<input type="submit" class="btn btn-lg btn-primary" value="Sign In">
			</div>

		</fieldset>
	</form>
</div>


</body>
</html>



