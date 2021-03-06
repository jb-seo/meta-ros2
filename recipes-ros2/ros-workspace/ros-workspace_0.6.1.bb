# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides the prefix level environment files for ROS 2 packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "  cmake"
SRC_URI = "https://github.com/ros2-gbp/ros_workspace-release/archive/release/crystal/ros_workspace/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2a02d4804c39f62b28649ec44b75faeb"
SRC_URI[sha256sum] = "b5806c6fd73383283d4a4eacb5026d308d9d8e1d0039a4ad115e9fda957062f9"
S = "${WORKDIR}/ros_workspace-release-release-crystal-ros_workspace-0.6.1-0"

inherit ament
