# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message/Service definitions specifically for the dwb_core"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " builtin-interfaces geometry-msgs nav-2d-msgs nav-msgs rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_msgs/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2a9f6cf2b2b2a76f7f7d539e5d3adab"
SRC_URI[sha256sum] = "aa2e110acb72418cfc8f3d1690b9c67966f9d8dd99d42f86e61f8309201eb03f"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_msgs-0.1.5-0"

inherit ament pythonpath-insane
