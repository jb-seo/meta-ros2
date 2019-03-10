# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake cv-bridge geometry-msgs image-transport qt-gui-cpp qtbase5-dev rclcpp rqt-gui rqt-gui-cpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/rqt_image_view-release/archive/release/crystal/rqt_image_view/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de7126966cd772e4fce3464c332d64e7"
SRC_URI[sha256sum] = "36aaa0d59df2005e1e0b220e15d13e79df9ec027ba28cf1b829e9f05c226c263"
S = "${WORKDIR}/rqt_image_view-release-release-crystal-rqt_image_view-1.0.0-0"

inherit catkin
