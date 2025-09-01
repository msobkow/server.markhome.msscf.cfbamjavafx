// Description: Java 11 JavaFX Display Element Factory for TokenDef.

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
 *	CFBamJavaFXTokenDefFactory JavaFX Display Element Factory
 *	for TokenDef.
 */
public class CFBamJavaFXTokenDefFactory
implements ICFBamJavaFXTokenDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTokenDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTokenDefObj argFocus ) {
		CFBamJavaFXTokenDefAttrPane retnew = new CFBamJavaFXTokenDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTokenDefObj argFocus,
		Collection<ICFBamTokenDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTokenDefListPane retnew = new CFBamJavaFXTokenDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTokenDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTokenDefObj> argDataCollection,
		ICFBamJavaFXTokenDefChosen whenChosen )
	{
		CFBamJavaFXTokenDefPickerPane retnew = new CFBamJavaFXTokenDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTokenDefObj argFocus ) {
		CFBamJavaFXTokenDefEltTabPane retnew = new CFBamJavaFXTokenDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTokenDefObj argFocus ) {
		CFBamJavaFXTokenDefAddPane retnew = new CFBamJavaFXTokenDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTokenDefObj argFocus ) {
		CFBamJavaFXTokenDefViewEditPane retnew = new CFBamJavaFXTokenDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTokenDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTokenDefAskDeleteForm retnew = new CFBamJavaFXTokenDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTokenDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTokenDefObj> argDataCollection,
		ICFBamJavaFXTokenDefChosen whenChosen )
	{
		CFBamJavaFXTokenDefPickerForm retnew = new CFBamJavaFXTokenDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTokenDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTokenDefAddForm retnew = new CFBamJavaFXTokenDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTokenDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTokenDefViewEditForm retnew = new CFBamJavaFXTokenDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
