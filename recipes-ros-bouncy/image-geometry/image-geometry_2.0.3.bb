# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "`image_geometry` contains C++ and Python libraries for interpreting images     geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo     messages with OpenCV functions such as image rectification, much as cv_bridge     interfaces ROS sensor_msgs/Image with OpenCV data types."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros libopencv-dev sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/image_geometry/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "95078b7707beb894865291ff2e847694"
SRC_URI[sha256sum] = "162920e72b968dc2c21afb4724da148cbcb4a8601d12e3180d2ee9a0173a2a88"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-image_geometry-2.0.3-0"

inherit catkin
