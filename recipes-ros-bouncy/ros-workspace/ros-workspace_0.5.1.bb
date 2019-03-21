# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides the prefix level environment files for ROS 2 packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/ros_workspace-release/archive/release/bouncy/ros_workspace/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd8bc263aa7558b4610dfb69ee41c035"
SRC_URI[sha256sum] = "2417d917dd856d122f0b332ecca368c2e2a7eb9d06626c073383a55b5e1fa403"
S = "${WORKDIR}/ros_workspace-release-release-bouncy-ros_workspace-0.5.1-0"

inherit ros
inherit cmake


