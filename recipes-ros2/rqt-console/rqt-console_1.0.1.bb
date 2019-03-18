# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_console provides a GUI plugin for displaying and filtering ROS messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "  python-qt-binding rcl-interfaces rclpy rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros2-gbp/rqt_console-release/archive/release/crystal/rqt_console/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "989b07b6f1c2f243c7cda184b5362550"
SRC_URI[sha256sum] = "394aa4341e913abde53c085889f1a314d4dc7f8bf6d0eaf33ab6f9ab582e0979"
S = "${WORKDIR}/rqt_console-release-release-crystal-rqt_console-1.0.1-0"

inherit ament
