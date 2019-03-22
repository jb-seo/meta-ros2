# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple follower using centroid in depth images."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    sensor-msgs \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support this concept, so build them when we build this package even though they aren't.
ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    sensor-msgs \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " \
    astra-camera \
    geometry-msgs \
    launch \
    rclcpp \
    ros2run \
    sensor-msgs \
    turtlebot2-drivers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_follower/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d793f99cf471744d7c30739d0e86304d"
SRC_URI[sha256sum] = "dfb21c06df4db78817abbbab4459f9a86f97ba708777aa0b57e7e7b71ed470ee"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_follower-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/turtlebot2-demo/turtlebot2-demo_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/turtlebot2-demo/turtlebot2-demo_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-demo/turtlebot2-demo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-demo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-demo/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

