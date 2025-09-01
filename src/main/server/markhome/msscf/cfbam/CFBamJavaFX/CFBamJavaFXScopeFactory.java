// Description: Java 11 JavaFX Display Element Factory for Scope.

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
 *	CFBamJavaFXScopeFactory JavaFX Display Element Factory
 *	for Scope.
 */
public class CFBamJavaFXScopeFactory
implements ICFBamJavaFXScopeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXScopeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamScopeObj argFocus ) {
		CFBamJavaFXScopeAttrPane retnew = new CFBamJavaFXScopeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ICFBamScopeObj argFocus,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXScopeListPane retnew = new CFBamJavaFXScopeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamScopeObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFBamJavaFXScopeChosen whenChosen )
	{
		CFBamJavaFXScopePickerPane retnew = new CFBamJavaFXScopePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamScopeObj argFocus ) {
		CFBamJavaFXScopeEltTabPane retnew = new CFBamJavaFXScopeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamScopeObj argFocus ) {
		CFBamJavaFXScopeAddPane retnew = new CFBamJavaFXScopeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamScopeObj argFocus ) {
		CFBamJavaFXScopeViewEditPane retnew = new CFBamJavaFXScopeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamScopeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXScopeAskDeleteForm retnew = new CFBamJavaFXScopeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamScopeObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFBamJavaFXScopeChosen whenChosen )
	{
		CFBamJavaFXScopePickerForm retnew = new CFBamJavaFXScopePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamScopeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXScopeAddForm retnew = new CFBamJavaFXScopeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamScopeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXScopeViewEditForm retnew = new CFBamJavaFXScopeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
