# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "`image_geometry` contains C++ and Python libraries for interpreting images     geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo     messages with OpenCV functions such as image rectification, much as cv_bridge     interfaces ROS sensor_msgs/Image with OpenCV data types."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " libopencv-dev sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/crystal/image_geometry/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c4f18587f63e6e62dff44cdca522982d"
SRC_URI[sha256sum] = "1fbf0988dbf901abd57568dc429988e5316f9184230dbe102d2cb783ccd7c913"
S = "${WORKDIR}/vision_opencv-release-release-crystal-image_geometry-2.1.0-0"

inherit ament
