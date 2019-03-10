# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package which extends 'ros_core' and includes other basic functionalities like tf2 and urdf."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake kdl-parser robot-state-publisher ros-core tf2 tf2-eigen tf2-geometry-msgs tf2-ros urdf"
SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/crystal/ros_base/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a31dd39f22c62cf6cbcb06c55e6e09b"
SRC_URI[sha256sum] = "f4024e4d573f5137a6c5d7865bdd4ea69875a111db2c4938b7995da59c8d4932"
S = "${WORKDIR}/variants-release-release-crystal-ros_base-0.6.1-0"

inherit catkin
