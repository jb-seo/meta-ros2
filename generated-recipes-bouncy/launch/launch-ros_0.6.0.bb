# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS specific extensions to the launch tool."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    launch \
    lifecycle-msgs \
    osrf-pycommon \
    rclpy \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    launch \
    lifecycle-msgs \
    osrf-pycommon \
    rclpy \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_EXPORT_DEPENDS}"

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    launch \
    lifecycle-msgs \
    osrf-pycommon \
    rclpy \
"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/launch_ros/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0c467077f25ef0989371cbcb172fcf3a"
SRC_URI[sha256sum] = "09cace8c789d3b1ac272664f7a9f98eafa9a84d1442ddf92a287946532062eec"
S = "${WORKDIR}/launch-release-release-bouncy-launch_ros-0.6.0-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/launch/launch_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/launch/launch_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/launch/launch-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/launch/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/launch/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

