# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code using pyflakes and generate xUnit test     result files."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = "python-pyflakes"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-pep8-native python3-pytest-native"

SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_pyflakes/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a83af62087fe57bf784a162982763927"
SRC_URI[sha256sum] = "88ae2b78794dbcbe8d6596e8c038a1221b88abb04d924054c65a568a47f56ad7"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_pyflakes-0.5.2-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ament-pyflakes/ament-pyflakes-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ament-pyflakes/ament-pyflakes-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-pyflakes/ament-pyflakes-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-pyflakes/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-pyflakes/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

