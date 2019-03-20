SUMMARY = "The ROS client library common implementation."
HOMEPAGE = "https://github.com/ros2/rcl"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    ament-cmake-ros \
    rmw \
    rcutils \
    rcl-interfaces \
    rmw-implementation \
    rosidl-generator-c \
"

RDEPENDS_${PN} = " \
    rosidl-default-runtime \
"

include rcl.inc
