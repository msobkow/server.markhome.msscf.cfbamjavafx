// Description: Java 11 JavaFX Display Element Factory for UuidDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXUuidDefFactory JavaFX Display Element Factory
 *	for UuidDef.
 */
public class CFBamJavaFXUuidDefFactory
implements ICFBamJavaFXUuidDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUuidDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidDefObj argFocus ) {
		CFBamJavaFXUuidDefAttrPane retnew = new CFBamJavaFXUuidDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamUuidDefObj argFocus,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUuidDefListPane retnew = new CFBamJavaFXUuidDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFBamJavaFXUuidDefChosen whenChosen )
	{
		CFBamJavaFXUuidDefPickerPane retnew = new CFBamJavaFXUuidDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUuidDefObj argFocus ) {
		CFBamJavaFXUuidDefEltTabPane retnew = new CFBamJavaFXUuidDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUuidDefObj argFocus ) {
		CFBamJavaFXUuidDefAddPane retnew = new CFBamJavaFXUuidDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUuidDefObj argFocus ) {
		CFBamJavaFXUuidDefViewEditPane retnew = new CFBamJavaFXUuidDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUuidDefAskDeleteForm retnew = new CFBamJavaFXUuidDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFBamJavaFXUuidDefChosen whenChosen )
	{
		CFBamJavaFXUuidDefPickerForm retnew = new CFBamJavaFXUuidDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUuidDefAddForm retnew = new CFBamJavaFXUuidDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUuidDefViewEditForm retnew = new CFBamJavaFXUuidDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
