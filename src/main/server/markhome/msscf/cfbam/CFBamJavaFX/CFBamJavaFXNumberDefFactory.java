// Description: Java 11 JavaFX Display Element Factory for NumberDef.

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
 *	CFBamJavaFXNumberDefFactory JavaFX Display Element Factory
 *	for NumberDef.
 */
public class CFBamJavaFXNumberDefFactory
implements ICFBamJavaFXNumberDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXNumberDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNumberDefObj argFocus ) {
		CFBamJavaFXNumberDefAttrPane retnew = new CFBamJavaFXNumberDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamNumberDefObj argFocus,
		Collection<ICFBamNumberDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXNumberDefListPane retnew = new CFBamJavaFXNumberDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNumberDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNumberDefObj> argDataCollection,
		ICFBamJavaFXNumberDefChosen whenChosen )
	{
		CFBamJavaFXNumberDefPickerPane retnew = new CFBamJavaFXNumberDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamNumberDefObj argFocus ) {
		CFBamJavaFXNumberDefEltTabPane retnew = new CFBamJavaFXNumberDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamNumberDefObj argFocus ) {
		CFBamJavaFXNumberDefAddPane retnew = new CFBamJavaFXNumberDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamNumberDefObj argFocus ) {
		CFBamJavaFXNumberDefViewEditPane retnew = new CFBamJavaFXNumberDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNumberDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXNumberDefAskDeleteForm retnew = new CFBamJavaFXNumberDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNumberDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNumberDefObj> argDataCollection,
		ICFBamJavaFXNumberDefChosen whenChosen )
	{
		CFBamJavaFXNumberDefPickerForm retnew = new CFBamJavaFXNumberDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNumberDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXNumberDefAddForm retnew = new CFBamJavaFXNumberDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNumberDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXNumberDefViewEditForm retnew = new CFBamJavaFXNumberDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
