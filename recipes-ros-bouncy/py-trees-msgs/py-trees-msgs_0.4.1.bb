# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by py_trees_ros and some extras for the mock demos/tests."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/stonier/py_trees_msgs-release/archive/release/bouncy/py_trees_msgs/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "43ae1cd504417fc2dddc134b50cdb84a"
SRC_URI[sha256sum] = "a6408e464e938457cacd5a9471be4ec3c04dc99401b25cb34d5be5a07817ca93"
S = "${WORKDIR}/py_trees_msgs-release-release-bouncy-py_trees_msgs-0.4.1-0"


inherit ros
inherit ament
inherit pythonpath-insane

