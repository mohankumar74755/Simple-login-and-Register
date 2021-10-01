<%@include file="CommonHeader.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: lightblue;
}
</style>

<div class="container">
	<h2 class="text-center" id="title">Sign Up Here</h2>
	<p class="text-center">
		<small id="passwordHelpInline" class="text-muted">  </small>
	</p>
	<hr>
	<div class="row">
		<div class="col-md-5">
			<form role="form" method="post" action="SignUp">
				<fieldset>
					<p class="text-uppercase pull-center">SIGN UP.</p>

<div class="form-group">
						<input type="text" name="firstname" id="firstname"
							class="form-control input-lg" placeholder="First Name">
					</div>

<div class="form-group">
						<input type="lastname" name="lastname" id="lastname"
							class="form-control input-lg" placeholder="Last Name">
					</div>

<div class="form-group">
						<input type="dateofbirth" name="dateofbirth" id="dateofbirth"
							class="form-control input-lg" placeholder="Date Of Birth">
					</div>

					<div class="form-group">
						<input type="emailaddress" name="emailaddress" id="emailaddress"
							class="form-control input-lg" placeholder="Email Address">
					</div>

<div class="form-group">
						<input type="contactnumber" name="contactnumber" id="contactnumber"
							class="form-control input-lg" placeholder="Contact Number">
					</div>

<div class="form-group">
						<input type="password" name="passwd" id="passwd"
							class="form-control input-lg" placeholder="Password">
					</div>


					<div class="form-check">
						<label class="form-check-label"> <input type="checkbox"
							class="form-check-input"> By Clicking register you're
							agree to our policy & terms
						</label>
					</div>
					<div>
						<input type="submit" class="btn btn-lg btn-primary"
							value="Sign Up">
					</div>
				</fieldset>
			</form>
		</div>

		</body>
		</html>
