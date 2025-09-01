// Description: Java 11 JavaFX Display Element Factory for BoolDef.

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
 *	CFBamJavaFXBoolDefFactory JavaFX Display Element Factory
 *	for BoolDef.
 */
public class CFBamJavaFXBoolDefFactory
implements ICFBamJavaFXBoolDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXBoolDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamBoolDefObj argFocus ) {
		CFBamJavaFXBoolDefAttrPane retnew = new CFBamJavaFXBoolDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamBoolDefObj argFocus,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXBoolDefListPane retnew = new CFBamJavaFXBoolDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamBoolDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFBamJavaFXBoolDefChosen whenChosen )
	{
		CFBamJavaFXBoolDefPickerPane retnew = new CFBamJavaFXBoolDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamBoolDefObj argFocus ) {
		CFBamJavaFXBoolDefEltTabPane retnew = new CFBamJavaFXBoolDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamBoolDefObj argFocus ) {
		CFBamJavaFXBoolDefAddPane retnew = new CFBamJavaFXBoolDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamBoolDefObj argFocus ) {
		CFBamJavaFXBoolDefViewEditPane retnew = new CFBamJavaFXBoolDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamBoolDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXBoolDefAskDeleteForm retnew = new CFBamJavaFXBoolDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamBoolDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFBamJavaFXBoolDefChosen whenChosen )
	{
		CFBamJavaFXBoolDefPickerForm retnew = new CFBamJavaFXBoolDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamBoolDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXBoolDefAddForm retnew = new CFBamJavaFXBoolDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamBoolDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXBoolDefViewEditForm retnew = new CFBamJavaFXBoolDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
