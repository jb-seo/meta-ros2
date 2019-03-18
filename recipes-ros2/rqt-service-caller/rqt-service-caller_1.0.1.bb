# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_service_caller provides a GUI plugin for calling arbitrary services."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros2-gbp/rqt_service_caller-release/archive/release/crystal/rqt_service_caller/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64c486ba9eebbbdd974d75c4ff8a874a"
SRC_URI[sha256sum] = "d8850f2897289e4414da4a2daf77e2f00e81c24e6753668e18c257b32ad53917"
S = "${WORKDIR}/rqt_service_caller-release-release-crystal-rqt_service_caller-1.0.1-0"

inherit ament
