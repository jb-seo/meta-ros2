# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package which extends 'ros_core' and includes other basic functionalities like tf2 and urdf."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "kdl-parser robot-state-publisher ros-core tf2 tf2-eigen tf2-geometry-msgs tf2-ros urdf"
SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/bouncy/ros_base/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a2c58c6e01a4b5c43d6e1b6da5f0f73"
SRC_URI[sha256sum] = "9fa5ef6c16d0be2dc78e923a57c7dd8b08ab38c088162b4d273a525371745399"
S = "${WORKDIR}/variants-release-release-bouncy-ros_base-0.5.1-0"


inherit ros
inherit ament

