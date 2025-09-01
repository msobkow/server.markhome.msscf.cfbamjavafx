// Description: Java 11 JavaFX Display Element Factory for TextDef.

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
 *	CFBamJavaFXTextDefFactory JavaFX Display Element Factory
 *	for TextDef.
 */
public class CFBamJavaFXTextDefFactory
implements ICFBamJavaFXTextDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTextDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTextDefObj argFocus ) {
		CFBamJavaFXTextDefAttrPane retnew = new CFBamJavaFXTextDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTextDefObj argFocus,
		Collection<ICFBamTextDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTextDefListPane retnew = new CFBamJavaFXTextDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTextDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTextDefObj> argDataCollection,
		ICFBamJavaFXTextDefChosen whenChosen )
	{
		CFBamJavaFXTextDefPickerPane retnew = new CFBamJavaFXTextDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTextDefObj argFocus ) {
		CFBamJavaFXTextDefEltTabPane retnew = new CFBamJavaFXTextDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTextDefObj argFocus ) {
		CFBamJavaFXTextDefAddPane retnew = new CFBamJavaFXTextDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTextDefObj argFocus ) {
		CFBamJavaFXTextDefViewEditPane retnew = new CFBamJavaFXTextDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTextDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTextDefAskDeleteForm retnew = new CFBamJavaFXTextDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTextDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTextDefObj> argDataCollection,
		ICFBamJavaFXTextDefChosen whenChosen )
	{
		CFBamJavaFXTextDefPickerForm retnew = new CFBamJavaFXTextDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTextDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTextDefAddForm retnew = new CFBamJavaFXTextDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTextDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTextDefViewEditForm retnew = new CFBamJavaFXTextDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
