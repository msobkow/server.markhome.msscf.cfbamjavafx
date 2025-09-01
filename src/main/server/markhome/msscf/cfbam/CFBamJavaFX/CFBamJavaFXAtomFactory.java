// Description: Java 11 JavaFX Display Element Factory for Atom.

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
 *	CFBamJavaFXAtomFactory JavaFX Display Element Factory
 *	for Atom.
 */
public class CFBamJavaFXAtomFactory
implements ICFBamJavaFXAtomFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXAtomFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamAtomObj argFocus ) {
		CFBamJavaFXAtomAttrPane retnew = new CFBamJavaFXAtomAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamAtomObj argFocus,
		Collection<ICFBamAtomObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXAtomListPane retnew = new CFBamJavaFXAtomListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamAtomObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamAtomObj> argDataCollection,
		ICFBamJavaFXAtomChosen whenChosen )
	{
		CFBamJavaFXAtomPickerPane retnew = new CFBamJavaFXAtomPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamAtomObj argFocus ) {
		CFBamJavaFXAtomEltTabPane retnew = new CFBamJavaFXAtomEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamAtomObj argFocus ) {
		CFBamJavaFXAtomAddPane retnew = new CFBamJavaFXAtomAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamAtomObj argFocus ) {
		CFBamJavaFXAtomViewEditPane retnew = new CFBamJavaFXAtomViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamAtomObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXAtomAskDeleteForm retnew = new CFBamJavaFXAtomAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamAtomObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamAtomObj> argDataCollection,
		ICFBamJavaFXAtomChosen whenChosen )
	{
		CFBamJavaFXAtomPickerForm retnew = new CFBamJavaFXAtomPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamAtomObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXAtomAddForm retnew = new CFBamJavaFXAtomAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamAtomObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXAtomViewEditForm retnew = new CFBamJavaFXAtomViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
