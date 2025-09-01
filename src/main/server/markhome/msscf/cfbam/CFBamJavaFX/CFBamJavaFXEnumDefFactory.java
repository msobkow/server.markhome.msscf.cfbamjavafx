// Description: Java 11 JavaFX Display Element Factory for EnumDef.

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
 *	CFBamJavaFXEnumDefFactory JavaFX Display Element Factory
 *	for EnumDef.
 */
public class CFBamJavaFXEnumDefFactory
implements ICFBamJavaFXEnumDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXEnumDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamEnumDefObj argFocus ) {
		CFBamJavaFXEnumDefAttrPane retnew = new CFBamJavaFXEnumDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamEnumDefObj argFocus,
		Collection<ICFBamEnumDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXEnumDefListPane retnew = new CFBamJavaFXEnumDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamEnumDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamEnumDefObj> argDataCollection,
		ICFBamJavaFXEnumDefChosen whenChosen )
	{
		CFBamJavaFXEnumDefPickerPane retnew = new CFBamJavaFXEnumDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamEnumDefObj argFocus ) {
		CFBamJavaFXEnumDefEltTabPane retnew = new CFBamJavaFXEnumDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamEnumDefObj argFocus ) {
		CFBamJavaFXEnumDefAddPane retnew = new CFBamJavaFXEnumDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamEnumDefObj argFocus ) {
		CFBamJavaFXEnumDefViewEditPane retnew = new CFBamJavaFXEnumDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamEnumDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXEnumDefAskDeleteForm retnew = new CFBamJavaFXEnumDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamEnumDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamEnumDefObj> argDataCollection,
		ICFBamJavaFXEnumDefChosen whenChosen )
	{
		CFBamJavaFXEnumDefPickerForm retnew = new CFBamJavaFXEnumDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamEnumDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXEnumDefAddForm retnew = new CFBamJavaFXEnumDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamEnumDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXEnumDefViewEditForm retnew = new CFBamJavaFXEnumDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
